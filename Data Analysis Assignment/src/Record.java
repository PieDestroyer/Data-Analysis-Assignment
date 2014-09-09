import java.util.ArrayList;
public class Record
	{
	private String letterCode;
	private double numberCode;
	
	public Record(String lc, double nc)
		{
		letterCode=lc;
		numberCode=nc;
		}
	
	public String getLetterCode()
		{
		return letterCode;
		}
	
	public void setLetterCode(String letterCode)
		{
		this.letterCode = letterCode;
		}
	
	public double getNumberCode()
		{
		return numberCode;
		}
	
	public void setNumberCode(double numberCode)
		{
		this.numberCode=numberCode;
		}

	}
