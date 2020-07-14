package net.avicus.atlas.core.channel.premium;

import net.avicus.atlas.core.channel.PrefixedChannel;
import net.avicus.atlas.core.text.Components;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public final class PremiumChannel extends PrefixedChannel {

  public PremiumChannel() {
    super("premium", "channel.premium", channelDescriptor("PREMIUM", ChatColor.GREEN));
  }
}