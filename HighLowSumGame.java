import java.util.*;

public class HighLowSumGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // CPU가 3개의 숫자를 비밀리에 선택
        List<Integer> cpuNumbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cpuNumbers.add(random.nextInt(20) + 1); // 1부터 20까지
        }
        int cpuSum = cpuNumbers.stream().mapToInt(Integer::intValue).sum();

        // 첫 2개의 CPU 숫자만 공개
        System.out.println("CPU 숫자 (처음 2개 공개): " + cpuNumbers.get(0) + ", " + cpuNumbers.get(1));
        System.out.println("세 번째 숫자는 비밀입니다!");

        // 플레이어가 첫 2개의 숫자를 뽑음
        List<Integer> playerNumbers = new ArrayList<>();
        playerNumbers.add(random.nextInt(20) + 1);
        playerNumbers.add(random.nextInt(20) + 1);

        System.out.println("당신의 숫자 (처음 2개): " + playerNumbers.get(0) + ", " + playerNumbers.get(1));
        System.out.println("세 번째 숫자는 추측 후 공개됩니다.");

        // 높을지 낮을지 추측 받기
        System.out.print("당신의 총합이 CPU보다 (h)높을까요, (l)낮을까요? 입력하세요: ");
        String guess = scanner.nextLine().trim().toLowerCase();

        // 플레이어의 세 번째 숫자 뽑기
        playerNumbers.add(random.nextInt(20) + 1);
        int playerSum = playerNumbers.stream().mapToInt(Integer::intValue).sum();

        // 모든 결과 출력
        System.out.println();
        System.out.println("당신의 전체 숫자: " + playerNumbers + " -> 총합: " + playerSum);
        System.out.println("CPU의 숫자: " + cpuNumbers + " -> 총합: " + cpuSum);

        // 결과 판정
        boolean playerWins = (guess.equals("h") && playerSum > cpuSum) ||
                             (guess.equals("l") && playerSum < cpuSum);

        if (playerSum == cpuSum) {
            System.out.println("무승부입니다!");
        } else if (playerWins) {
            System.out.println("정답입니다! 당신이 이겼습니다!");
        } else {
            System.out.println("틀렸습니다. CPU가 승리했습니다.");
        }

        scanner.close();
    }
}
