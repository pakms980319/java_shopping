package Ch13;

interface Remocon{
	int MAXVOL=100;
	int MINVOL=0;
	void On();
	void Off();
	void setVolumn(int vol);
}
interface Browser{
	void SearchURL(String url);
}
class TV implements Remocon{
	private int vol;
	@Override
	public void On() {
		System.out.println("TV 를 켭니다");	
	}
	@Override
	public void Off() {
		System.out.println("TV 를 끕니다");
	}
	@Override
	public void setVolumn(int vol) {
		if(vol>=MAXVOL)
			this.vol=MAXVOL;
		else if(vol<=MINVOL)
			this.vol=MINVOL;
		else 
			this.vol = vol;
		System.out.println("현재 TV Volumn : " + this.vol);
	}
}
class SmartTv extends TV implements Browser{

	@Override
	public void SearchURL(String url) {
		System.out.println(url + " 로 이동합니다");
	}
		
}

class Radio implements Remocon{
	private int vol;
	@Override
	public void On() {
		System.out.println("RADIO를 켭니다");
	}
	@Override
	public void Off() {
		System.out.println("RADIO를 끕니다");
	}
	@Override
	public void setVolumn(int vol) {
		if(vol>=MAXVOL)
			this.vol=MAXVOL;
		else if(vol<=MINVOL)
			this.vol=MINVOL;
		else 
			this.vol = vol;
		System.out.println("현재 Radio Volumn : " + this.vol);
	}
	
}


public class C02InterfaceMain {

	public static void TurnOn(Remocon remocon) {
		remocon.On();
	}
	public static void TurnOff(Remocon remocon) {
		remocon.Off();
	}
	public static void Volumn(Remocon remocon, int vol) {
		remocon.setVolumn(vol);
	}
	public static void BrowserSearch(Browser searchUrl,String url) {
		searchUrl.SearchURL(url);
	}
	
	public static void main(String[] args) {
		
		TV tv1 = new TV();
		Radio radio1 = new Radio();
		
		SmartTv smartTv = new SmartTv();
		TurnOn(smartTv);
		Volumn(smartTv,50);
		BrowserSearch(smartTv,"www.naver.com");
		
		
//		TurnOn(tv1);
//		Volumn(tv1,10);
//		
//		TurnOn(radio1);
//		Volumn(radio1,105);
//		
//		TurnOff(tv1);
//		TurnOff(radio1);
		
		
	}
	
}




