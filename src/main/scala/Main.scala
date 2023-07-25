
import net.dv8tion.jda.api.entities.{Activity, Guild}
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.events.ExceptionEvent
import net.dv8tion.jda.api.events.guild.update.GuildUpdateNameEvent
import net.dv8tion.jda.api.events.guild.{GuildJoinEvent, GuildLeaveEvent}
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.events.session.{ReadyEvent, ShutdownEvent}
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.{EmbedBuilder, JDA, JDABuilder}

import java.awt.Color
import java.util.concurrent.{Executors, ScheduledExecutorService, TimeUnit}
import scala.util.control.Breaks.break



object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
  }
}