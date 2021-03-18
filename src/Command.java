package DiscordBotAlpha;

import java.util.Random;
import java.util.stream.IntStream;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Command  extends ListenerAdapter {
	
	@Override
	public void onMessageReceived(MessageReceivedEvent one) {
		
		if (one.getMessage().getContentRaw().equals("|Alpha")) {
			one.getChannel().sendMessage("Artoria Online.").queue();
		}
		if(one.getMessage().getContentRaw().equalsIgnoreCase("|coinflip")) {
			Random coinFlip = new Random();
			EmbedBuilder coinFlips = new EmbedBuilder();
			int coin = coinFlip.nextInt(2);
			coinFlips.setTitle("COIN FLIP");
			if (coin == 0) {
				coinFlips.setDescription("The result of this coin \nflip is...");
				coinFlips.addField("HEADS", "", true);
				one.getChannel().sendMessage(coinFlips.build()).queue();
			}
			else {
				coinFlips.setDescription("The result of this coin \nflip is...");
				coinFlips.addField("TAILS", "", true);
				one.getChannel().sendMessage(coinFlips.build()).queue();
			}
		}
		if (one.getMessage().getContentRaw().equalsIgnoreCase("|dice")) {
			Random dice = new Random();
			int diceRoll = dice.nextInt(6);
			EmbedBuilder diceNum = new EmbedBuilder();
			diceNum.setTitle("DICE ROLL RESULT: ");
			
			if (diceRoll == 0) {
				diceNum.addField("The Number is: ", "1", true);
				diceNum.setThumbnail("https://www.clker.com/cliparts/w/d/1/K/l/p/dice-1-hi.png");
				one.getChannel().sendMessage(diceNum.build()).queue();
				//one.getChannel().sendMessage("1").queue();
			}
			if (diceRoll == 1) {
				diceNum.addField("The Number is: ", "2", true);
				diceNum.setThumbnail("https://www.clker.com/cliparts/a/Y/E/o/z/t/dice-2-md.png");
				one.getChannel().sendMessage(diceNum.build()).queue();
				//one.getChannel().sendMessage("2").queue();
			}
			if (diceRoll == 2) {
				diceNum.addField("The Number is: ", "3", true);
				diceNum.setThumbnail("https://www.clker.com/cliparts/M/e/P/O/L/b/dice-3.svg");
				one.getChannel().sendMessage(diceNum.build()).queue();
				//one.getChannel().sendMessage("3").queue();
			}
			if (diceRoll == 3) {
				diceNum.addField("The Number is: ", "4", true);
				diceNum.setThumbnail("https://www.clker.com/cliparts/r/z/d/a/L/V/dice-4-hi.png");
				one.getChannel().sendMessage(diceNum.build()).queue();
				//one.getChannel().sendMessage("4").queue();
			}
			if (diceRoll == 4) {
				diceNum.addField("The Number is: ", "5", true);
				diceNum.setThumbnail("https://www.clker.com/cliparts/e/y/7/h/W/K/dice-5-hi.png");
				one.getChannel().sendMessage(diceNum.build()).queue();
				//one.getChannel().sendMessage("5").queue();
			}
			if (diceRoll == 5) {
				diceNum.addField("The Number is: ", "6", true);
				diceNum.setThumbnail("https://www.clker.com/cliparts/l/6/4/3/K/H/dice-6-hi.png");
				one.getChannel().sendMessage(diceNum.build()).queue();
				//one.getChannel().sendMessage("6").queue();
			}
			
		}
		if (one.getMessage().getContentRaw().equalsIgnoreCase("|play my playlist")) {
			one.getChannel().sendMessage("!play https://www.youtube.com/playlist?list=PLfwsgi6-i5afeswwfViMhQMOee7rJxBUI").queue();
		}
		
	}
	

}
