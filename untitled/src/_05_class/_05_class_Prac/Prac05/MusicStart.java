package _05_class._05_class_Prac.Prac05;

public class MusicStart {
    public static void main(String[] args) {
        // Mp3Player와 CdPlayer 객체 생성
        Music mp3Player = new Mp3Player();
        Music cdPlayer = new CdPlayer();

        // Mp3Player에서 음악 재생 및 정지
        mp3Player.play("윤하 개복치");
        mp3Player.stop("윤하 개복치");

        // CdPlayer에서 음악 재생 및 정지
        cdPlayer.play("윤하 아일랜드포크송");
        cdPlayer.stop("윤하 아일랜드포크송");
    }
}
