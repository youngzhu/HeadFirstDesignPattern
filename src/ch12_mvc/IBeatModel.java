package ch12_mvc;

public interface IBeatModel {

	void initialize();
	  
	void on();
  
	void off();
  
    void setBPM(int bpm);
  
	int getBPM();
  
	// 节拍（Beat）有变化时就通知
	void registerObserver(IBeatObserver o);
  
	void removeObserver(IBeatObserver o);
  
	// BPM 有变化时通知
	void registerObserver(IBPMObserver o);
  
	void removeObserver(IBPMObserver o);
}
