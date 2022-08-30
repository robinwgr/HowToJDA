package de.robixxlp;

import de.robixxlp.events.ListenerClass;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class HowToJDA {

    private static final String DISCORD_BOT_TOKEN = "YOUR_TOKEN";

    public static void main(String[] args) throws LoginException {
        final JDABuilder builder = JDABuilder.createDefault(DISCORD_BOT_TOKEN);

        // To register a listener, you have to use the following Code.
        // In the correct code the name "ListenerClass" must be replaced by the name of the class you want to register.
        builder.addEventListeners(new ListenerClass());

        // Enable all intents for the bot.
        // More detailed information about Discord Intents can be found here: https://discord.com/developers/docs/topics/gateway#gateway-intents .
        builder.enableIntents(EnumSet.allOf(GatewayIntent.class));

        // Builds the jda from the builder
        final JDA jda = builder.build();

        //  To register a slash command in the Main class, the method JDA#upsertCommand() is used.
        // "commandname" must be replaced by the name of the command you want to create.
        // "Commanddescription" must be changed to the description of your slash command.
        jda.upsertCommand("commandname", "Commanddescription").queue();

        // In addition, there is the possibility to add further arguments to your slash command.
        // Arguments can be added as follows:
    }
}
