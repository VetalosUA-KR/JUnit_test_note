package com.vitalii.unittestingnote.di;

import android.app.Application;

import com.vitalii.unittestingnote.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;


@Component (
        modules = {
                AndroidInjectionModule.class,
                AppModule.class,
                ActivityBuildersModule.class,
                ViewModelFactoryModule.class,
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface  Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

}
