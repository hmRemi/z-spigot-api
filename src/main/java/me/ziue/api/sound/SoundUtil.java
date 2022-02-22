package me.ziue.api.sound;

import lombok.experimental.UtilityClass;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

@UtilityClass
public class SoundUtil {

    // Play sound using arguments, player & sound.
    public void play(Player player, String sound) {
        // Check if sound isn't empty.
        if (!sound.isEmpty()) {
            // Play sound at the players' location, using sound in arguments[2].
            player.playSound(player.getLocation(), Sound.valueOf(sound), 1F, 1F);
        }
    }
}