package com.jvosantos.actuator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.boot.actuate.metrics.writer.Delta;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;

public class SampleMetricWriter implements MetricWriter {
    public static final Logger LOGGER = LoggerFactory.getLogger(SampleMetricWriter.class);

    @Override
    public void increment(Delta<?> delta) {
        LOGGER.info("increment: " + delta.getName() + " - " + delta.getValue());
    }

    @Override
    public void reset(String s) {
        LOGGER.info("reset: " + s);
    }

    @Override
    public void set(Metric<?> metric) {
        LOGGER.info("set: " + metric.getName() + " - " + metric.getValue());
    }
}
