package org.example.homework_20;

public record Stock(Long id, String ticker, String companyName, Long profitYear, String location, Long updateDateTime) {
  // для updateDateTime лучше подойдет LocalDatetime, а не Long
}
