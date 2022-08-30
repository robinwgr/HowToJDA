package de.robixxlp.slashcommands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class HowToSlashCommands extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(final @NotNull SlashCommandInteractionEvent event){
        // First you have to check if the name of the command you want to execute is the same as the name of the command in your main class.
        if (event.getName().equals("commandname")) return;

        // Your command code
    }
}
