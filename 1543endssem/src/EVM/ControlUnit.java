package EVM;

public class ControlUnit 
{

boolean pollstatus=true;
boolean reset=false;	
boolean beep=false;
int totalvotes;
int BJPcount;
int CONGRESScount;	



//count bjp votes
public int getBjpvotes(int BJPcount)
{
return BJPcount;
}


//count congress
public int getCongressvotes(int CONGRESScount)
{
return CONGRESScount;
}


//total votes in control unit
public int getTotalvotes(int totalvotes)
{
return totalvotes;
}


//Reset all vote counts
public void setResetUnit(boolean reset)
{
	this.reset=reset;
}


//set value if poll is opened or closed
public void setPollStatus(boolean pollstatus)
{
	this.pollstatus=pollstatus;
}


//beep if voter has casted vote
public void setButtonStatus(boolean beep)
{
this.beep=beep;
}


}
