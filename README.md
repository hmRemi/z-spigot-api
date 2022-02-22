<h2 align="center">
<br>
  <br>
    <br>
  A Bukkit/Spigot API to simplify usage of command and rank / chat formatting.
  <br>
</h2>

<div align="center">

**Installation:**

zAPI can be built easily, but requires copies of the Spigot server jars to be present locally on your machine in order to be compatible with any Minecraft version. zAPI is built using the Maven build tool - if you don't have it, you can download it [here](https://maven.apache.org/download.cgi).

- Clone the repository using your preferred method, or with the command below:

  ```
  git clone https://github.com/ziuee/zAPI.git
  ```

- Go into the folder named `zAPI`, from there you want the folder which contains `pom.xml`.

- Run the pom using `mvn`

- Grab then the created JAR file and add it to your maven project.

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
