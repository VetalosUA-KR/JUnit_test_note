package com.vitalii.unittestingnote.di;


import androidx.lifecycle.ViewModelProvider;

import com.vitalii.unittestingnote.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);

}
