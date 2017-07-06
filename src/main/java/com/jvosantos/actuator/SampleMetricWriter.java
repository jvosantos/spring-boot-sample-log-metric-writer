package com.jvosantos.actuator;

import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.boot.actuate.metrics.writer.Delta;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;

public class SampleMetricWriter implements MetricWriter {
    @Override
    public void increment(Delta<?> delta) {
        System.out.println(delta.getName() + " - " + delta.getValue());
    }

    @Override
    public void reset(String s) {
        System.out.println(s);

    }

    @Override
    public void set(Metric<?> metric) {
        System.out.println(metric.getName() + " - " + metric.getValue());
    }
}
