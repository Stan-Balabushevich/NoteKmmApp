package id.slava.nt.myfirstkmmapp.android.di

import android.app.Application
import app.cash.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.slava.nt.myfirstkmmapp.data.local.DatabaseDriverFactory
import id.slava.nt.myfirstkmmapp.data.note.SqlDelightNoteDataSource
import id.slava.nt.myfirstkmmapp.database.NoteDatabase
import id.slava.nt.myfirstkmmapp.domain.note.NoteDataSource
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(NoteDatabase(driver))
    }
}