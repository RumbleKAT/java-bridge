package bridge;

import camp.nextstep.edu.missionutils.Console;

import java.util.IllegalFormatException;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        int size = 0;
        try{
            size = Integer.parseInt(Console.readLine());
        }catch(NumberFormatException e){
            System.out.println("[ERROR] 잘못된 입력 형식 입니다.");
        }
        return size;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
