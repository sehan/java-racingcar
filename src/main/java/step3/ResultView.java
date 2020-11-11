package step3;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    private RaceDisplay raceDisplay = RaceDisplay.console();

    public void showRaceState(List<Car> cars){
        cars.forEach( car -> car.displayOn(raceDisplay));
        raceDisplay.writeBlankLine();
    }

    public void showRaceWinner(List<Car> winners){
        String winnerNames = winners.stream().map(it -> it.getName()).collect(Collectors.joining(","));
        raceDisplay.writeLine(winnerNames +"가 최종 우승했습니다.");
    }
}
