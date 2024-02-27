package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		System.out.println(calcFivePercentage(100));
		calcAvgTime();

		List<String> words = new ArrayList<>();
		words.add("retasd");

		Map<String, Integer> scores = words.stream()
				.collect(Collectors.toMap(word -> word, Main::calcPointsPerWord));

		List<String> sortedWords = scores.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.map(Map.Entry::getKey)
				.toList();

		System.out.println("Wörter sortiert nach Punktzahl:");
		sortedWords.forEach(System.out::println);
	}


	public static int calcFivePercentage(int total) {
		return (total * 95 / 100);
	}

	public static List<String> addDestination(List<String> route, String newDestination) {
		List<String> strings = List.copyOf(route);
		strings.add(newDestination);
		return strings;
	}

	public static int calcPointsPerWord(String word) {
		return word.chars()
				.map(ch -> ch == 'a' ? 0 : 1)
				.sum();
	}

	public static void calcAvgTime() {
		List<List<Double>> zeitenProAuto = Arrays.asList(
				Arrays.asList(30.5, 28.2, 29.8, 27.6),
				Arrays.asList(31.2, 29.7, 30.0, 28.3),
				Arrays.asList(29.9, 28.8, 30.5, 27.9)
		);

		double gesamtzeit = zeitenProAuto.stream()
				.flatMapToDouble(autoZeiten -> autoZeiten.stream().mapToDouble(Double::doubleValue))
				.sum();

		List<Double> durchschnittszeiten = zeitenProAuto.stream()
				.map(autoZeiten -> autoZeiten.stream().skip(1))
				.mapToDouble(autoZeiten -> autoZeiten.mapToDouble(Double::doubleValue).average().orElse(0))
				.boxed()
				.toList();

		System.out.println("Gesamtzeit für alle Runden: " + gesamtzeit + " Sekunden");
		System.out.println("Durchschnittszeit pro Auto (ohne erste Runde): " + durchschnittszeiten);
	}
}
