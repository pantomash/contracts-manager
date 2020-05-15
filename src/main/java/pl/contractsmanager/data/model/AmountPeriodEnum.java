package pl.contractsmanager.data.model;

public enum AmountPeriodEnum {
    MONTH("miesięczne"), QUARTER("kwartalny"), YEAR("roczny");

    private final String value;

    AmountPeriodEnum(String value) { this.value = value; }

    public String getValue() { return value; }
}
