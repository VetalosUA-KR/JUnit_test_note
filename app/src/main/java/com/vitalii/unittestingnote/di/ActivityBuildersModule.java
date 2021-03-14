package com.vitalii.unittestingnote.di;

import com.vitalii.unittestingnote.NotesListActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract NotesListActivity contributeNoteListActivity();

}
