<h2 align="center">
<br>
  <br>
    <br>
  A Bukkit/Spigot API to simplify usage of command and rank / chat systematting.
  <br>
</h2>

<div align="center">

**Documentation:**
<details>
	<summary><b>Simple command registration</b></summary>
  
```java
public void registerCommands() {
    new CommandManager(this);
    new FlyCommand();
}
```
</details>
<details>
	<summary><b>Simple Fly Command</summary>
  
```java
public class FlyCommand extends BaseCommand {

	@Command(name = "fly", permission = "zapi.fly")
	@Override
	public void onCommand(CommandArgs commandArgs) {
		Player player = commandArgs.getPlayer();

			if (player.getAllowFlight()) {
				player.setAllowFlight(false);
				player.setFlying(false);
				player.updateInventory();
				player.sendMessage(CC.RED + "You are no longer flying.");
			} else {
				player.setAllowFlight(true);
				player.setFlying(true);
				player.updateInventory();
				player.sendMessage(CC.GREEN + "You are now flying.");
			}
		}
	}
}
```
</details>
