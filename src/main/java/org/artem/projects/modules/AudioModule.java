package org.artem.projects.modules;

import com.google.inject.AbstractModule;
import org.artem.projects.App;
import org.artem.projects.services.AudioBytesFetcher;
import org.artem.projects.services.BytesFetcher;
import org.artem.projects.services.ImageDrawService;

public class AudioModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(App.class);
        bind(ImageDrawService.class);
        bind(BytesFetcher.class).to(AudioBytesFetcher.class);
    }
}
