import javax.swing.*;

public class Ability
{
  private String name;
  private String desc;
  private int cost;
  private int level;
  private boolean doesDamage;
  private int code;
  private boolean targetsAll;
  private JButton trigger = new JButton(name);
  public Ability(String aName, String aDesc, int mC, int lv, boolean damaging, int abilityCode, boolean all)
  {
    name = aName;
    desc = aDesc;
    cost = mC;
    level = lv;
    doesDamage = damaging;
    code = abilityCode;
    targetsAll = all;
  }
  public String getName()
  {
    return name;
  }
  public String getDesc()
  {
    return desc;
  }
  public int getCost()
  {
    return cost;
  }
  public boolean doesDamage()
  {
    return doesDamage;
  }
  public int getCode()
  {
    return code;
  }
  public boolean getTarget(){return targetsAll;}
  public JButton getTrigger(){return trigger;}
}