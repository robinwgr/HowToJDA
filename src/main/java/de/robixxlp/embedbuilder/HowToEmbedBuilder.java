package de.robixxlp.embedbuilder;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Embeds for Discord can be created with the EmbedBuilder. Said embeds can then be used in many ways.
 */
public class HowToEmbedBuilder extends ListenerAdapter {

    /**
     * This method creates a new embed.
     */
    public void createEmbed() {
        // A new instance of Embed Builder is created here.
        final EmbedBuilder builder = new EmbedBuilder();
    }
}
