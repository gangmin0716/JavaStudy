package access;

public class SpeakerMain1 {
    public static void main(String[] args) {
        Speaker1 speaker1 = new Speaker1(90);
        speaker1.showVolume();
        speaker1.volumeUp();
        speaker1.showVolume();
        speaker1.volumeUp();
        speaker1.volumeDown();

        System.out.println("volume 필드 직접 접근 수정");
        speaker1.volume = 200;
        speaker1.showVolume();
    }
}

class Speaker1 {
    int volume;
    Speaker1(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음략을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}