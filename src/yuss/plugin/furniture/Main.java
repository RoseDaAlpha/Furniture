package yuss.plugin.furniture;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new EventListener(this), this);
        this.getLogger().info("家具插件加载成功！By 冬逸");
    }
}
