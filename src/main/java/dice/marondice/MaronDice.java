package dice.marondice;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class MaronDice extends JavaPlugin {

    String prefix = "§f§l[§d§lM§e§lDice§f§l]§r";

    @Override
    public void onEnable() {
        // プラグインが起動したら起こる処理
        getLogger().info("まろんダイスを起動しました！");
        getCommand("mdice").setExecutor(this);
    }

    @Override
    public void onDisable() {
        // プラグインが停止したら起こる処理
        getLogger().info("まろんダイスを停止しました！");
    }
    @Override
    public  boolean  onCommand(CommandSender sender, Command command, String label, String[] args) {
        int mdice = new Random().nextInt(Integer.parseInt(args[0]))+1;
        Bukkit.broadcastMessage(prefix + ChatColor.WHITE + sender.getName() + "は" + args[0] + "面ダイスを振り" + ChatColor.YELLOW + mdice + ChatColor.WHITE + "が出た！！");
        return true;
    }
}