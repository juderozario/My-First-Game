
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class DemonSlayerMain {

    static Rui rui = new Rui();
    static Akaza akaza = new Akaza();
    static Muzan muzan = new Muzan();
    static Inosuke inosuke = new Inosuke();
    static Kamado kamado = new Kamado();
    static Zenitsu zenitsu = new Zenitsu();
    public static int heals = 2;
    public static String choice;

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        // Initiate all music files and audio streams
        File startMenu = new File("bin/Music/Demon Slayer Kimetsu no Yaiba the Movie - Mugen Train Ending FullLiSA - Homura.wav");
        File ruiFile = new File("bin/Music/Gurenge.wav");
        File akazaFile = new File("bin/Music/Demon Slayer Movie Akaza vs Rengoku Theme EPIC HQ COVER (Mugen Train OST).wav");
        File muzanFile = new File("bin/Music/Demon Slayer Kimetsu no Yaiba ED (Ep19) Full - Kamado Tanjirou no Uta (Lyrics).wav");
        File gameOverFile = new File("bin/Music/game over sound.wav");
        File youWinFile = new File("bin/Music/youWin.wav");
        
        AudioInputStream startMenuSound = AudioSystem.getAudioInputStream(startMenu);
        AudioInputStream ruiSound = AudioSystem.getAudioInputStream(ruiFile);
        AudioInputStream akazaSound = AudioSystem.getAudioInputStream(akazaFile);
        AudioInputStream muzanSound = AudioSystem.getAudioInputStream(muzanFile);
        AudioInputStream gameOverSound = AudioSystem.getAudioInputStream(gameOverFile);
        AudioInputStream youWinSound = AudioSystem.getAudioInputStream(youWinFile);
        
        Clip startMenuClip = AudioSystem.getClip();
        Clip ruiSoundClip = AudioSystem.getClip();
        Clip akazaSoundClip = AudioSystem.getClip();
        Clip muzanSoundClip = AudioSystem.getClip();
        Clip gameOverClip = AudioSystem.getClip();
        Clip youWinClip = AudioSystem.getClip();
        
        startMenuClip.open(startMenuSound);
        ruiSoundClip.open(ruiSound);
        akazaSoundClip.open(akazaSound);
        muzanSoundClip.open(muzanSound);
        gameOverClip.open(gameOverSound);
        youWinClip.open(youWinSound);
        
        FloatControl startMenuVolume = (FloatControl) startMenuClip.getControl(FloatControl.Type.MASTER_GAIN);
        FloatControl ruiVolume = (FloatControl) ruiSoundClip.getControl(FloatControl.Type.MASTER_GAIN);
        FloatControl akazaVolume = (FloatControl) akazaSoundClip.getControl(FloatControl.Type.MASTER_GAIN);
        FloatControl muzanVolume = (FloatControl) muzanSoundClip.getControl(FloatControl.Type.MASTER_GAIN);
        FloatControl gameOverVolume = (FloatControl) gameOverClip.getControl(FloatControl.Type.MASTER_GAIN);
        FloatControl youWinVolume = (FloatControl) youWinClip.getControl(FloatControl.Type.MASTER_GAIN);

        // Create a frame from the MyFrame class 
        choice = "S";
        new MyFrame(ruiSoundClip, akazaSoundClip, muzanSoundClip, ruiVolume, akazaVolume, muzanVolume, startMenuClip, startMenuVolume, gameOverClip, gameOverVolume, youWinClip, youWinVolume);
        PlaySound.getSound(ruiSoundClip, akazaSoundClip, muzanSoundClip, ruiVolume, akazaVolume, muzanVolume, startMenuClip, 
        startMenuVolume, gameOverClip, gameOverVolume, youWinClip, youWinVolume, choice);
    }
    // Changing character health
    public static int kamadoHealth(int damage){
        kamado.healthTanjiro-=damage;
        return kamado.healthTanjiro;
    }
    public static int zenitsuHealth(int damage){
        zenitsu.healthZenitsu-=damage;
        return zenitsu.healthZenitsu;
    }
    public static int inosukeHealth(int damage){
        inosuke.healthInosuke-=damage;
        return inosuke.healthInosuke;
    }
    public static int ruiHealth(int damage){
        rui.healthRui-=damage;
        return rui.healthRui;
    }
    public static int akazaHealth(int damage){
        akaza.akazaHealth-=damage;
        return akaza.akazaHealth;
    }
    public static int muzanHealth(int damage){
        muzan.healthMuzan-=damage;
        return muzan.healthMuzan;
    }
}
