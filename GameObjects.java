import java.util.*;
public class GameObjects 
{
	private static Item[] allItems = {
			new Item("Potion", "Restores 150 HP", 100, "I01"),
			new Item("Big Potion", "Restores 500 HP", 625, "I02"), 
			new Item("Max Potion", "Restores all HP", 1500, "I03"),
			new Item("Magic Bottle", "Restores 50 MP", 450, "I04"), 
			new Item("Magic Pot", "Restores all MP", 1000, "I05"),
			new Item("Warp Panel", "Warps out of dungeon back to shop", 400, "I06"),
			
			};
	public static Item[] getAllItems()
	{
		return allItems;
	}
	private static Ability[] allFighterSkills = {
			new Ability("Heavy Hit", "High chance of missing, but double attack power", 32, 2),
			new Ability("Subtract Attack", "More damage the lower the HP", 16, 2), 
			new Ability("Flash Slash", "Hits all enemies", 44, 3),
			new Ability("Shock", "Deals massive damage", 108, 4)
			};
	public static Ability[] getAllFighterSkills()
	{
		return allFighterSkills;
	}
	private static Ability[] allNinjaSkills = {
			new Ability("Flames", "Deals damage to all enemies", 20, 1),
			new Ability("Flood", "Deals damage to all enemies", 30, 2),
			new Ability("Electrocute", "Deals a lot of damage", 45, 3),
			new Ability("Smokescreen", "Increases enemy miss change", 25, 3)
			};
	public static Ability[] getAllNinjaSkills()
	{
		return allNinjaSkills;
	}
	private static Ability[] allWizardMagic = {
			new Ability("Icicle", "Deals small damage to one enemy", 24, 1),
			new Ability("Gust", "Deals small damage to all enemies", 42, 1),
			new Ability("Voltage", "Deals moderate damage to one enemy", 72, 2),
			new Ability("Flamethrower", "Deals moderate damage to all enemies", 96, 2),
			new Ability("Meteor", "Deals high damage to one enemy", 148, 3),
			new Ability("Tsunami", "Deals high damage to all enemies", 192, 3),
			new Ability("Fissure", "Deals massive damage to one enemy", 286, 4),
			new Ability("Black Hole", "Deals massive damage to all enemies", 364, 4)
	};
	public static Ability[] getAllWizardMagic()
	{
		return allWizardMagic;
	}
	private static Ability[] allHealerMagic = {
			new Ability("Heal", "Heals a small amount to an ally", 20, 1),
			new Ability("Restore", "Heals a moderate amount to an ally", 46, 2),
			new Ability("Revive", "Revives a knocked ally with small HP", 64, 2),
			new Ability("All Cure", "Heals a small amount to all allies", 44, 2),
			new Ability("Rejuvenate", "Heals a large amount to an ally", 96, 3),
			new Ability("Recovery Field", "Heals a large amount to all allies", 184, 4),
			new Ability("Renew", "Revives a knocked ally with all HP", 232, 4)
			};
	public static Ability[] getAllHealerMagic()
	{
		return allHealerMagic;
	}
	//items
}
