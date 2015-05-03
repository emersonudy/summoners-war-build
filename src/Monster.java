
public class Monster
{
	private String element, basicForm, notes;
	private double overallGrade, AreanOffense, DungeonGrade, ArenaDefense;
	
	public Monster(String element1, String Form)
	{
		element=element1;
		basicForm=Form;
		setValues();
	}
	
	public void setElement(String element1)
	{
		element=element1;
		setValues();
	}
	public void setBasicForm(String basicForm1)
	{
		basicForm=basicForm1;
		setValues();
	}
	public void setNotes(String notes1)
	{
		notes=notes1;
		setValues();
	}

	public String getElement(){return element;}
	public String getBasicForm(){return basicForm;}
	public String getNotes(){return notes;}
	
	private void setValues()
	{
		if (element.charAt(0)=='F'||element.charAt(0)=='f')
		{setFire();}
		if ((element.charAt(0)=='W'||element.charAt(0)=='w')&&(element.charAt(1)=='A'||element.charAt(1)=='a'))
		{setWater();}
		if ((element.charAt(0)=='W'||element.charAt(0)=='w')&&(element.charAt(1)=='I'||element.charAt(1)=='i'))
		{setWind();}
		if (element.charAt(0)=='L'||element.charAt(0)=='l')
		{setLight();}
		if (element.charAt(0)=='D'||element.charAt(0)=='d')
		{setDark();}		
	}

	private void setWater()
	{
		if (basicForm=="Imp"||basicForm=="imp")
		{
			AreanOffense=5;
			DungeonGrade=10;
			ArenaDefense=1;
			overallGrade=7;
		}
		else if (basicForm=="Pixie"||basicForm=="pixie")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}
		else if (basicForm=="Yeti"||basicForm=="yeti")
		{
			AreanOffense=1;
			DungeonGrade=5;
			ArenaDefense=6;
			overallGrade=4;
		}
		else if (basicForm=="Hellhound"||basicForm=="hellhound")
		{
			AreanOffense=9;
			DungeonGrade=6;
			ArenaDefense=5;
			overallGrade=7;
		}
		else if (basicForm=="Warbear"||basicForm=="warbear")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=10;
			overallGrade=8;
		}
		else if (basicForm=="Elemental"||basicForm=="elemental")
		{
			AreanOffense=5;
			DungeonGrade=10;
			ArenaDefense=1;
			overallGrade=7;
		}
		else if (basicForm=="Garuda"||basicForm=="garuda")
		{
			AreanOffense=5;
			DungeonGrade=6;
			ArenaDefense=8;
			overallGrade=6;
		}
		else if (basicForm=="Harpu"||basicForm=="harpu")
		{
			AreanOffense=5;
			DungeonGrade=5;
			ArenaDefense=7;
			overallGrade=5;
		}
		else if (basicForm=="Salamander"||basicForm=="salamander")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=4;
			overallGrade=4;
		}
		else if (basicForm=="Viking"||basicForm=="viking")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=7;
			overallGrade=7;
		}
		else if (basicForm=="Howl"||basicForm=="howl")
		{
			AreanOffense=6;
			DungeonGrade=8;
			ArenaDefense=10;
			overallGrade=9;
		}
		else if (basicForm=="Vagabond"||basicForm=="vagabond")
		{
			AreanOffense=6;
			DungeonGrade=5;
			ArenaDefense=7;
			overallGrade=6;
		}

		//3 Star

		else if (basicForm=="Fairy"||basicForm=="fairy")
		{
			AreanOffense=7;
			DungeonGrade=6;
			ArenaDefense=9;
			overallGrade=8;
		}
		else if (basicForm=="Harpy"||basicForm=="harpy")
		{
			AreanOffense=6;
			DungeonGrade=5;
			ArenaDefense=3;
			overallGrade=4;
		}
		else if (basicForm=="Inugami"||basicForm=="inugami")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Serpent"||basicForm=="serpent")
		{
			AreanOffense=7;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Golem"||basicForm=="golem")
		{
			AreanOffense=5;
			DungeonGrade=6;
			ArenaDefense=10;
			overallGrade=7;
		}
		else if (basicForm=="Griffon"||basicForm=="griffon")
		{
			AreanOffense=5;
			DungeonGrade=5;
			ArenaDefense=6;
			overallGrade=5;
		}
		else if (basicForm=="Inferno"||basicForm=="inferno")
		{
			AreanOffense=7;
			DungeonGrade=8;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="High Elemental"||basicForm=="high elemental"||basicForm=="High elemental")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Bearman"||basicForm=="bearman")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=9;
			overallGrade=6;
		}
		else if (basicForm=="Werewolf"||basicForm=="werewolf")
		{
			AreanOffense=8;
			DungeonGrade=9;
			ArenaDefense=10;
			overallGrade=9;
		}
		else if (basicForm=="Amazon"||basicForm=="amazon")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Martial Cat"||basicForm=="martial cat"||basicForm=="Martial cat")
		{
			AreanOffense=9;
			DungeonGrade=7;
			ArenaDefense=4;
			overallGrade=8;
		}
		else if (basicForm=="Magical Archer"||basicForm=="magical archer"||basicForm=="Magical archer")
		{
			AreanOffense=9;
			DungeonGrade=4;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="Beast Hunter"||basicForm=="beast hunter"||basicForm=="Beast hunter")
		{
			AreanOffense=9;
			DungeonGrade=7;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Mystic Witch"||basicForm=="mystic witch"||basicForm=="Mystic witch")
		{
			AreanOffense=10;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Epikion Priest"||basicForm=="epikion priest"||basicForm=="Epikion priest")
		{
			AreanOffense=7;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}
		else if (basicForm=="Grim Reaper"||basicForm=="grim reaper"||basicForm=="Grim Reaper")
		{
			AreanOffense=5;
			DungeonGrade=8;
			ArenaDefense=4;
			overallGrade=5;
		}
		else if (basicForm=="Living Armor"||basicForm=="living armor"||basicForm=="Living armor")
		{
			AreanOffense=6;
			DungeonGrade=7;
			ArenaDefense=8;
			overallGrade=7;
		}

		//4 Star

		else if (basicForm=="9-tails"||basicForm=="9-Tails")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Undine"||basicForm=="undine")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=9;
			overallGrade=8;
		}
		else if (basicForm=="Sylph"||basicForm=="sylph")
		{
			AreanOffense=10;
			DungeonGrade=9;
			ArenaDefense=10;
			overallGrade=10;
		}
		else if (basicForm=="Sylphid"||basicForm=="sylphid")
		{
			AreanOffense=4;
			DungeonGrade=5;
			ArenaDefense=7;
			overallGrade=5;
		}
		else if (basicForm=="Succubus"||basicForm=="succubus")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Joker"||basicForm=="joker")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=6;
			overallGrade=5;
		}
		else if (basicForm=="Ninja"||basicForm=="ninja")
		{
			AreanOffense=6;
			DungeonGrade=5;
			ArenaDefense=7;
			overallGrade=6;
		}
		else if (basicForm=="Pierret"||basicForm=="pierret")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Phantom Thief"||basicForm=="phantom thief"||basicForm=="Phantom thief")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Vampire"||basicForm=="vampire")
		{
			AreanOffense=5;
			DungeonGrade=4;
			ArenaDefense=7;
			overallGrade=5;
		}
		else if (basicForm=="Rakshasa"||basicForm=="rakshasa")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="Death Knight"||basicForm=="death knight"||basicForm=="Death knight")
		{
			AreanOffense=9;
			DungeonGrade=10;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Lich"||basicForm=="lich")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=6;
			overallGrade=6;
		}
	
	}
	private void setWind()
	{
		if (basicForm=="Imp"||basicForm=="imp")
		{
			AreanOffense=9;
			DungeonGrade=6;
			ArenaDefense=4;
			overallGrade=7;
		}
		else if (basicForm=="Pixie"||basicForm=="pixie")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=9;
			overallGrade=8;
		}
		else if (basicForm=="Yeti"||basicForm=="yeti")
		{
			AreanOffense=6;
			DungeonGrade=9;
			ArenaDefense=10;
			overallGrade=9;
		}
		else if (basicForm=="Hellhound"||basicForm=="hellhound")
		{
			AreanOffense=5;
			DungeonGrade=8;
			ArenaDefense=3;
			overallGrade=6;
		}
		else if (basicForm=="Warbear"||basicForm=="warbear")
		{
			AreanOffense=10;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=10;
		}
		else if (basicForm=="Elemental"||basicForm=="elemental")
		{
			AreanOffense=8;
			DungeonGrade=9;
			ArenaDefense=4;
			overallGrade=7;
		}
		else if (basicForm=="Garuda"||basicForm=="garuda")
		{
			AreanOffense=6;
			DungeonGrade=4;
			ArenaDefense=3;
			overallGrade=4;
		}
		else if (basicForm=="Harpu"||basicForm=="harpu")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=6;
			overallGrade=8;
		}
		else if (basicForm=="Salamander"||basicForm=="salamander")
		{
			AreanOffense=5;
			DungeonGrade=6;
			ArenaDefense=7;
			overallGrade=5;
		}
		else if (basicForm=="Viking"||basicForm=="viking")
		{
			AreanOffense=5;
			DungeonGrade=8;
			ArenaDefense=5;
			overallGrade=7;
		}
		else if (basicForm=="Howl"||basicForm=="howl")
		{
			AreanOffense=5;
			DungeonGrade=5;
			ArenaDefense=2;
			overallGrade=3;
		}
		else if (basicForm=="Vagabond"||basicForm=="vagabond")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}

		//3 Star

		else if (basicForm=="Fairy"||basicForm=="fairy")
		{
			AreanOffense=7;
			DungeonGrade=6;
			ArenaDefense=9;
			overallGrade=8;
		}
		else if (basicForm=="Harpy"||basicForm=="harpy")
		{
			AreanOffense=6;
			DungeonGrade=5;
			ArenaDefense=3;
			overallGrade=4;
		}
		else if (basicForm=="Inugami"||basicForm=="inugami")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Serpent"||basicForm=="serpent")
		{
			AreanOffense=7;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Golem"||basicForm=="golem")
		{
			AreanOffense=5;
			DungeonGrade=6;
			ArenaDefense=10;
			overallGrade=7;
		}
		else if (basicForm=="Griffon"||basicForm=="griffon")
		{
			AreanOffense=5;
			DungeonGrade=5;
			ArenaDefense=6;
			overallGrade=5;
		}
		else if (basicForm=="Inferno"||basicForm=="inferno")
		{
			AreanOffense=7;
			DungeonGrade=8;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="High Elemental"||basicForm=="high elemental"||basicForm=="High elemental")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Bearman"||basicForm=="bearman")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=9;
			overallGrade=6;
		}
		else if (basicForm=="Werewolf"||basicForm=="werewolf")
		{
			AreanOffense=8;
			DungeonGrade=9;
			ArenaDefense=10;
			overallGrade=9;
		}
		else if (basicForm=="Amazon"||basicForm=="amazon")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Martial Cat"||basicForm=="martial cat"||basicForm=="Martial cat")
		{
			AreanOffense=9;
			DungeonGrade=7;
			ArenaDefense=4;
			overallGrade=8;
		}
		else if (basicForm=="Magical Archer"||basicForm=="magical archer"||basicForm=="Magical archer")
		{
			AreanOffense=9;
			DungeonGrade=4;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="Beast Hunter"||basicForm=="beast hunter"||basicForm=="Beast hunter")
		{
			AreanOffense=9;
			DungeonGrade=7;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Mystic Witch"||basicForm=="mystic witch"||basicForm=="Mystic witch")
		{
			AreanOffense=10;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Epikion Priest"||basicForm=="epikion priest"||basicForm=="Epikion priest")
		{
			AreanOffense=7;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}
		else if (basicForm=="Grim Reaper"||basicForm=="grim reaper"||basicForm=="Grim Reaper")
		{
			AreanOffense=5;
			DungeonGrade=8;
			ArenaDefense=4;
			overallGrade=5;
		}
		else if (basicForm=="Living Armor"||basicForm=="living armor"||basicForm=="Living armor")
		{
			AreanOffense=6;
			DungeonGrade=7;
			ArenaDefense=8;
			overallGrade=7;
		}

		//4 Star

		else if (basicForm=="9-tails"||basicForm=="9-Tails")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Undine"||basicForm=="undine")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=9;
			overallGrade=8;
		}
		else if (basicForm=="Sylph"||basicForm=="sylph")
		{
			AreanOffense=10;
			DungeonGrade=9;
			ArenaDefense=10;
			overallGrade=10;
		}
		else if (basicForm=="Sylphid"||basicForm=="sylphid")
		{
			AreanOffense=4;
			DungeonGrade=5;
			ArenaDefense=7;
			overallGrade=5;
		}
		else if (basicForm=="Succubus"||basicForm=="succubus")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Joker"||basicForm=="joker")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=6;
			overallGrade=5;
		}
		else if (basicForm=="Ninja"||basicForm=="ninja")
		{
			AreanOffense=6;
			DungeonGrade=5;
			ArenaDefense=7;
			overallGrade=6;
		}
		else if (basicForm=="Pierret"||basicForm=="pierret")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Phantom Thief"||basicForm=="phantom thief"||basicForm=="Phantom thief")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Vampire"||basicForm=="vampire")
		{
			AreanOffense=5;
			DungeonGrade=4;
			ArenaDefense=7;
			overallGrade=5;
		}
		else if (basicForm=="Rakshasa"||basicForm=="rakshasa")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="Death Knight"||basicForm=="death knight"||basicForm=="Death knight")
		{
			AreanOffense=9;
			DungeonGrade=10;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Lich"||basicForm=="lich")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=6;
			overallGrade=6;
		}		
	}
	private void setFire()
	{
		if (basicForm=="Imp"||basicForm=="imp")
		{
			AreanOffense=5;
			DungeonGrade=9;
			ArenaDefense=1;
			overallGrade=6;
		}
		else if (basicForm=="Pixie"||basicForm=="pixie")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="Yeti"||basicForm=="yeti")
		{
			AreanOffense=7;
			DungeonGrade=8;
			ArenaDefense=10;
			overallGrade=9;
		}
		else if (basicForm=="Hellhound"||basicForm=="hellhound")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=4;
			overallGrade=7;
		}
		else if (basicForm=="Warbear"||basicForm=="warbear")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=4;
			overallGrade=4;
		}
		else if (basicForm=="Elemental"||basicForm=="elemental")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=4;
			overallGrade=7;
		}
		else if (basicForm=="Garuda"||basicForm=="garuda")
		{
			AreanOffense=4;
			DungeonGrade=3;
			ArenaDefense=1;
			overallGrade=3;
		}
		else if (basicForm=="Harpu"||basicForm=="harpu")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=6;
			overallGrade=8;
		}
		else if (basicForm=="Salamander"||basicForm=="salamander")
		{
			AreanOffense=7;
			DungeonGrade=5;
			ArenaDefense=5;
			overallGrade=5;
		}
		else if (basicForm=="Viking"||basicForm=="viking")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Howl"||basicForm=="howl")
		{
			AreanOffense=4;
			DungeonGrade=3;
			ArenaDefense=3;
			overallGrade=3;
		}
		else if (basicForm=="Vagabond"||basicForm=="vagabond")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}

		//3 Star

		else if (basicForm=="Fairy"||basicForm=="fairy")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=5;
			overallGrade=8;
		}
		else if (basicForm=="Harpy"||basicForm=="harpy")
		{
			AreanOffense=6;
			DungeonGrade=7;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Inugami"||basicForm=="inugami")
		{
			AreanOffense=9;
			DungeonGrade=10;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Serpent"||basicForm=="serpent")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=5;
			overallGrade=4;
		}
		else if (basicForm=="Golem"||basicForm=="golem")
		{
			AreanOffense=3;
			DungeonGrade=4;
			ArenaDefense=9;
			overallGrade=5;
		}
		else if (basicForm=="Griffon"||basicForm=="griffon")
		{
			AreanOffense=9;
			DungeonGrade=5;
			ArenaDefense=6;
			overallGrade=7;
		}
		else if (basicForm=="Inferno"||basicForm=="inferno")
		{
			AreanOffense=7;
			DungeonGrade=9;
			ArenaDefense=5;
			overallGrade=7;
		}
		else if (basicForm=="High Elemental"||basicForm=="high elemental"||basicForm=="High elemental")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=3;
			overallGrade=7;
		}
		else if (basicForm=="Bearman"||basicForm=="bearman")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=5;
			overallGrade=4;
		}
		else if (basicForm=="Werewolf"||basicForm=="werewolf")
		{
			AreanOffense=4;
			DungeonGrade=8;
			ArenaDefense=9;
			overallGrade=8;
		}
		else if (basicForm=="Amazon"||basicForm=="amazon")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=4;
			overallGrade=7;
		}
		else if (basicForm=="Martial Cat"||basicForm=="martial cat"||basicForm=="Martial cat")
		{
			AreanOffense=7;
			DungeonGrade=6;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="Magical Archer"||basicForm=="magical archer"||basicForm=="Magical archer")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=5;
			overallGrade=8;
		}
		else if (basicForm=="Beast Hunter"||basicForm=="beast hunter"||basicForm=="Beast hunter")
		{
			AreanOffense=9;
			DungeonGrade=7;
			ArenaDefense=5;
			overallGrade=8;
		}
		else if (basicForm=="Mystic Witch"||basicForm=="mystic witch"||basicForm=="Mystic witch")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="Epikion Priest"||basicForm=="epikion priest"||basicForm=="Epikion priest")
		{
			AreanOffense=9;
			DungeonGrade=10;
			ArenaDefense=10;
			overallGrade=10;
		}
		else if (basicForm=="Grim Reaper"||basicForm=="grim reaper"||basicForm=="Grim Reaper")
		{
			AreanOffense=8;
			DungeonGrade=9;
			ArenaDefense=5;
			overallGrade=7;
		}
		else if (basicForm=="Living Armor"||basicForm=="living armor"||basicForm=="Living armor")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=10;
			overallGrade=9;
		}

		//4 Star

		else if (basicForm=="9-tails"||basicForm=="9-Tails")
		{
			AreanOffense=7;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Undine"||basicForm=="undine")
		{
			AreanOffense=5;
			DungeonGrade=5;
			ArenaDefense=8;
			overallGrade=6;
		}
		else if (basicForm=="Sylph"||basicForm=="sylph")
		{
			AreanOffense=9;
			DungeonGrade=10;
			ArenaDefense=7;
			overallGrade=9;
		}
		else if (basicForm=="Sylphid"||basicForm=="sylphid")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Succubus"||basicForm=="succubus")
		{
			AreanOffense=8;
			DungeonGrade=10;
			ArenaDefense=6;
			overallGrade=9;
		}
		else if (basicForm=="Joker"||basicForm=="joker")
		{
			AreanOffense=7;
			DungeonGrade=10;
			ArenaDefense=6;
			overallGrade=8;
		}
		else if (basicForm=="Ninja"||basicForm=="ninja")
		{
			AreanOffense=7;
			DungeonGrade=8;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="Pierret"||basicForm=="pierret")
		{
			AreanOffense=10;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Phantom Thief"||basicForm=="phantom thief"||basicForm=="Phantom thief")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Vampire"||basicForm=="vampire")
		{
			AreanOffense=10;
			DungeonGrade=9;
			ArenaDefense=8;
			overallGrade=10;
		}
		else if (basicForm=="Rakshasa"||basicForm=="rakshasa")
		{
			AreanOffense=10;
			DungeonGrade=9;
			ArenaDefense=8;
			overallGrade=10;
		}
		else if (basicForm=="Death Knight"||basicForm=="death knight"||basicForm=="Death knight")
		{
			AreanOffense=8;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}
		else if (basicForm=="Lich"||basicForm=="lich")
		{
			AreanOffense=10;
			DungeonGrade=9;
			ArenaDefense=8;
			overallGrade=10;
		}
	}
	private void setLight()
	{
		if (basicForm=="Imp"||basicForm=="imp")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Pixie"||basicForm=="pixie")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Yeti"||basicForm=="yeti")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Hellhound"||basicForm=="hellhound")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Warbear"||basicForm=="warbear")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Elemental"||basicForm=="elemental")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}
		else if (basicForm=="Garuda"||basicForm=="garuda")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Harpu"||basicForm=="harpu")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}
		else if (basicForm=="Salamander"||basicForm=="salamander")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Viking"||basicForm=="viking")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Howl"||basicForm=="howl")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}
		else if (basicForm=="Vagabond"||basicForm=="vagabond")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}

		//3 Star

		else if (basicForm=="Fairy"||basicForm=="fairy")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}
		else if (basicForm=="Harpy"||basicForm=="harpy")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}
		else if (basicForm=="Inugami"||basicForm=="inugami")
		{
			AreanOffense=10;
			DungeonGrade=10;
			ArenaDefense=10;
			overallGrade=10;
		}
		else if (basicForm=="Serpent"||basicForm=="serpent")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}
		else if (basicForm=="Golem"||basicForm=="golem")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=4;
			overallGrade=4;
		}
		else if (basicForm=="Griffon"||basicForm=="griffon")
		{
			AreanOffense=3;
			DungeonGrade=3;
			ArenaDefense=3;
			overallGrade=3;
		}
		else if (basicForm=="Inferno"||basicForm=="inferno")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="High Elemental"||basicForm=="high elemental"||basicForm=="High elemental")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Bearman"||basicForm=="bearman")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Werewolf"||basicForm=="werewolf")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}
		else if (basicForm=="Amazon"||basicForm=="amazon")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}
		else if (basicForm=="Martial Cat"||basicForm=="martial cat"||basicForm=="Martial cat")
		{
			AreanOffense=5;
			DungeonGrade=5;
			ArenaDefense=5;
			overallGrade=5;
		}
		else if (basicForm=="Magical Archer"||basicForm=="magical archer"||basicForm=="Magical archer")
		{
			AreanOffense=10;
			DungeonGrade=10;
			ArenaDefense=10;
			overallGrade=10;
		}
		else if (basicForm=="Beast Hunter"||basicForm=="beast hunter"||basicForm=="Beast hunter")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Mystic Witch"||basicForm=="mystic witch"||basicForm=="Mystic witch")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Epikion Priest"||basicForm=="epikion priest"||basicForm=="Epikion priest")
		{
			AreanOffense=10;
			DungeonGrade=10;
			ArenaDefense=10;
			overallGrade=10;
		}
		else if (basicForm=="Grim Reaper"||basicForm=="grim reaper"||basicForm=="Grim Reaper")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Living Armor"||basicForm=="living armor"||basicForm=="Living armor")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}

		//4 Star

		else if (basicForm=="9-tails"||basicForm=="9-Tails")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}
		else if (basicForm=="Undine"||basicForm=="undine")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}
		else if (basicForm=="Sylph"||basicForm=="sylph")
		{
			AreanOffense=10;
			DungeonGrade=10;
			ArenaDefense=10;
			overallGrade=10;
		}
		else if (basicForm=="Sylphid"||basicForm=="sylphid")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Succubus"||basicForm=="succubus")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}
		else if (basicForm=="Joker"||basicForm=="joker")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Ninja"||basicForm=="ninja")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}
		else if (basicForm=="Pierret"||basicForm=="pierret")
		{
			AreanOffense=8;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Phantom Thief"||basicForm=="phantom thief"||basicForm=="Phantom thief")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}
		/*else if (basicForm=="Vampire"||basicForm=="vampire")
		{
			AreanOffense=5;
			DungeonGrade=4;
			ArenaDefense=7;
			overallGrade=5;
		}*/
		else if (basicForm=="Rakshasa"||basicForm=="rakshasa")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}
		else if (basicForm=="Death Knight"||basicForm=="death knight"||basicForm=="Death knight")
		{
			AreanOffense=10;
			DungeonGrade=10;
			ArenaDefense=10;
			overallGrade=10;
		}
		/*else if (basicForm=="Lich"||basicForm=="lich")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=6;
			overallGrade=6;
		}*/
	}
	private void setDark()
	{
		if (basicForm=="Imp"||basicForm=="imp")
			
		{
			AreanOffense=9;
			DungeonGrade=6;
			ArenaDefense=4;
			overallGrade=7;
		}
		else if (basicForm=="Pixie"||basicForm=="pixie")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=9;
			overallGrade=8;
		}
		else if (basicForm=="Yeti"||basicForm=="yeti")
		{
			AreanOffense=6;
			DungeonGrade=9;
			ArenaDefense=10;
			overallGrade=9;
		}
		else if (basicForm=="Hellhound"||basicForm=="hellhound")
		{
			AreanOffense=5;
			DungeonGrade=8;
			ArenaDefense=3;
			overallGrade=6;
		}
		else if (basicForm=="Warbear"||basicForm=="warbear")
		{
			AreanOffense=10;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=10;
		}
		else if (basicForm=="Elemental"||basicForm=="elemental")
		{
			AreanOffense=8;
			DungeonGrade=9;
			ArenaDefense=4;
			overallGrade=7;
		}
		else if (basicForm=="Garuda"||basicForm=="garuda")
		{
			AreanOffense=6;
			DungeonGrade=4;
			ArenaDefense=3;
			overallGrade=4;
		}
		else if (basicForm=="Harpu"||basicForm=="harpu")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=6;
			overallGrade=8;
		}
		else if (basicForm=="Salamander"||basicForm=="salamander")
		{
			AreanOffense=5;
			DungeonGrade=6;
			ArenaDefense=7;
			overallGrade=5;
		}
		else if (basicForm=="Viking"||basicForm=="viking")
		{
			AreanOffense=5;
			DungeonGrade=8;
			ArenaDefense=5;
			overallGrade=7;
		}
		else if (basicForm=="Howl"||basicForm=="howl")
		{
			AreanOffense=5;
			DungeonGrade=5;
			ArenaDefense=2;
			overallGrade=3;
		}
		else if (basicForm=="Vagabond"||basicForm=="vagabond")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=7;
		}

		//3 Star

		else if (basicForm=="Fairy"||basicForm=="fairy")
		{
			AreanOffense=7;
			DungeonGrade=6;
			ArenaDefense=9;
			overallGrade=8;
		}
		else if (basicForm=="Harpy"||basicForm=="harpy")
		{
			AreanOffense=6;
			DungeonGrade=5;
			ArenaDefense=3;
			overallGrade=4;
		}
		else if (basicForm=="Inugami"||basicForm=="inugami")
		{
			AreanOffense=6;
			DungeonGrade=6;
			ArenaDefense=6;
			overallGrade=6;
		}
		else if (basicForm=="Serpent"||basicForm=="serpent")
		{
			AreanOffense=7;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Golem"||basicForm=="golem")
		{
			AreanOffense=5;
			DungeonGrade=6;
			ArenaDefense=10;
			overallGrade=7;
		}
		else if (basicForm=="Griffon"||basicForm=="griffon")
		{
			AreanOffense=5;
			DungeonGrade=5;
			ArenaDefense=6;
			overallGrade=5;
		}
		else if (basicForm=="Inferno"||basicForm=="inferno")
		{
			AreanOffense=7;
			DungeonGrade=8;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="High Elemental"||basicForm=="high elemental"||basicForm=="High elemental")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Bearman"||basicForm=="bearman")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=9;
			overallGrade=6;
		}
		else if (basicForm=="Werewolf"||basicForm=="werewolf")
		{
			AreanOffense=8;
			DungeonGrade=9;
			ArenaDefense=10;
			overallGrade=9;
		}
		else if (basicForm=="Amazon"||basicForm=="amazon")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Martial Cat"||basicForm=="martial cat"||basicForm=="Martial cat")
		{
			AreanOffense=9;
			DungeonGrade=7;
			ArenaDefense=4;
			overallGrade=8;
		}
		else if (basicForm=="Magical Archer"||basicForm=="magical archer"||basicForm=="Magical archer")
		{
			AreanOffense=9;
			DungeonGrade=4;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="Beast Hunter"||basicForm=="beast hunter"||basicForm=="Beast hunter")
		{
			AreanOffense=9;
			DungeonGrade=7;
			ArenaDefense=8;
			overallGrade=8;
		}
		else if (basicForm=="Mystic Witch"||basicForm=="mystic witch"||basicForm=="Mystic witch")
		{
			AreanOffense=10;
			DungeonGrade=8;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Epikion Priest"||basicForm=="epikion priest"||basicForm=="Epikion priest")
		{
			AreanOffense=7;
			DungeonGrade=9;
			ArenaDefense=9;
			overallGrade=9;
		}
		else if (basicForm=="Grim Reaper"||basicForm=="grim reaper"||basicForm=="Grim Reaper")
		{
			AreanOffense=5;
			DungeonGrade=8;
			ArenaDefense=4;
			overallGrade=5;
		}
		else if (basicForm=="Living Armor"||basicForm=="living armor"||basicForm=="Living armor")
		{
			AreanOffense=6;
			DungeonGrade=7;
			ArenaDefense=8;
			overallGrade=7;
		}

		//4 Star

		else if (basicForm=="9-tails"||basicForm=="9-Tails")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Undine"||basicForm=="undine")
		{
			AreanOffense=8;
			DungeonGrade=7;
			ArenaDefense=9;
			overallGrade=8;
		}
		else if (basicForm=="Sylph"||basicForm=="sylph")
		{
			AreanOffense=10;
			DungeonGrade=9;
			ArenaDefense=10;
			overallGrade=10;
		}
		else if (basicForm=="Sylphid"||basicForm=="sylphid")
		{
			AreanOffense=4;
			DungeonGrade=5;
			ArenaDefense=7;
			overallGrade=5;
		}
		else if (basicForm=="Succubus"||basicForm=="succubus")
		{
			AreanOffense=9;
			DungeonGrade=9;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Joker"||basicForm=="joker")
		{
			AreanOffense=4;
			DungeonGrade=4;
			ArenaDefense=6;
			overallGrade=5;
		}
		else if (basicForm=="Ninja"||basicForm=="ninja")
		{
			AreanOffense=6;
			DungeonGrade=5;
			ArenaDefense=7;
			overallGrade=6;
		}
		else if (basicForm=="Pierret"||basicForm=="pierret")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Phantom Thief"||basicForm=="phantom thief"||basicForm=="Phantom thief")
		{
			AreanOffense=9;
			DungeonGrade=8;
			ArenaDefense=7;
			overallGrade=8;
		}
		else if (basicForm=="Vampire"||basicForm=="vampire")
		{
			AreanOffense=5;
			DungeonGrade=4;
			ArenaDefense=7;
			overallGrade=5;
		}
		else if (basicForm=="Rakshasa"||basicForm=="rakshasa")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=5;
			overallGrade=6;
		}
		else if (basicForm=="Death Knight"||basicForm=="death knight"||basicForm=="Death knight")
		{
			AreanOffense=9;
			DungeonGrade=10;
			ArenaDefense=8;
			overallGrade=9;
		}
		else if (basicForm=="Lich"||basicForm=="lich")
		{
			AreanOffense=7;
			DungeonGrade=7;
			ArenaDefense=6;
			overallGrade=6;
		}
	}

}
