package plaindoll;

import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Welcomer{
	// Если хочешь больше веселья и информации про ДевОпс - приходи в мои каналы NotOps (telegram, YT, Boosty, Patreon)
	// https://t.me/notopsofficial
	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}
	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}
	public String sayNeedGold(){
		return "Not enough gold";
	}
	public String saySome(){
		return "something in the way";
	}
	
	// НОВЫЙ МЕТОД
	public String getHunterReply() {
		List<String> replies = Arrays.asList(
			"The hunter stalks silently in the night",
			"A wise hunter knows patience",
			"Hunter2 is the most famous password",
			"The lone hunter never misses",
			"Every hunter needs a prey"
		);
		Random random = new Random();
		return replies.get(random.nextInt(replies.size()));
	}
}