import java.util.ArrayList;

public class MasterHacker
{
	public static void main(String[] args)
	{
		String[] comment = {"Me, was pretty easy. Used a reverse ", " to occupy space on the Reddit ", ". Once traffic came through for that account I flipped the receiving ", " to my ", " and harvested the password as it were being transmitted. I also opened a ", " to gain ", " access on their ", ". From there it was a simple job of breaking through the ", " and getting into the ", ". Grabbed a few passwords and started hacking the accounts."};
		String[] techwords = {"DNS transcoder", "network", "address", "PC", "backwards tunnel", "LAN", "network", "firewalls", "local admin accounts", "AI", "blockchain", "neural network"};
		
		techwords = shuffle(techwords);
		
		System.out.println(comment[0]);
		for (int i = 0; i < comment.length - 1; i++)
		{
			System.out.print(techwords[i] + comment[i + 1]);
		}
	}
	
	public static String[] shuffle(String[] in) //shuffle method because Java doesnt have one
	{
		String[] out = new String[in.length];
		ArrayList<String> inA = new ArrayList<String>();
		for (int i = 0; i < in.length; i++)
		{
			inA.add(in[i]);
		}
		
		for (int i = 0; i < in.length; i++)
		{
			int remove = (int) (Math.random() * inA.size());
			out[i] = inA.get(remove);
			inA.remove(remove);
		}
		return out;
	}
}
