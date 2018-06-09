public class Item 
{
	private int value;
	private String name;
	private String code;
	private String desc;
	public Item(String itemName, String itemDesc, int itemValue, String itemCode)
	{
		name = itemName;
		value = itemValue;
		code = itemCode;
		desc = itemDesc;
	}
	public int getValue()
	{
		return value;
	}
	public String getCode()
	{
		return code;
	}
	public String getName()
	{
		return name;
	}
	public String getDesc()
	{
		return desc;
	}
}
