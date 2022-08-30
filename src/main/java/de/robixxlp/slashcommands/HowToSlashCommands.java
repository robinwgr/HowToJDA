package de.robixxlp.slashcommands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class HowToSlashCommands extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){

        /*
        German:
        Als erstes muss abgefragt werden, ob der Name des auszuführenden Commands, dem Namen des Commands, in deiner Main Klasse entspricht.

        English:
        First you have to check if the name of the command you want to execute is the same as the name of the command in your main class.
         */
        if(event.getName().equals("commandname")) return;
    }
}
