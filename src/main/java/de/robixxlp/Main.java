package de.robixxlp;

import de.robixxlp.events.ListenerClass;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) throws LoginException {


        JDABuilder builder = JDABuilder.createDefault("TOKEN");

        /*
        German:
        um einen Listener zu registrieren, wird folgender Code verwendet.
        Im richtigen Code muss der Name "ListenerClass" durch den Namen deiner Klasse getauscht werden, welche du registrieren möchtest.

        English:
        To register a listener, you have to use the following Code.
        In the correct code the name "ListenerClass" must be replaced by the name of the class you want to register.
         */

        builder.addEventListeners(new ListenerClass());

        /*
        German:
        Aktiviere alle Intents für den Bot.
        Genauere Informationen zu den Discord Intents können hier nachgelesen werden: https://discord.com/developers/docs/topics/gateway#gateway-intents .

        English:
        Enable all intents for the bot.
        More detailed information about Discord Intents can be found here: https://discord.com/developers/docs/topics/gateway#gateway-intents .
         */

        builder.enableIntents(EnumSet.allOf(GatewayIntent.class));

        JDA jda = builder.build();

        /*
        German:
        Um einen Slash Command in der Main Klasse zu registrieren wird die Methode JDA#upsertCommand() verwendet.
        "commandname" muss durch den Namen deines, zu erstellenden Commands ersetzt werden. "German: Commandbeschreibung | English: Commanddescription" muss durch die Beschreibung deines Slash Commands geändert werden.

        English:
        To register a slash command in the Main class, the method JDA#upsertCommand() is used.
        "commandname" must be replaced by the name of the command you want to create. "German: Commandbeschreibung | English: Commanddescription" must be changed to the description of your slash command.
         */
        jda.upsertCommand("commandname", "German: Commandbeschreibung | English: Commanddescription").queue();


        /*
        German:
        Zudem gibt es die Möglichkeit, weitere Argumente zu deinem Slash Command hinzuzufügen.
        Argumente können folgendermaßen hinzugefügt werden:

        English:
        In addition, there is the possibility to add further arguments to your slash command.
        Arguments can be added as follows:
         */

    }
}
