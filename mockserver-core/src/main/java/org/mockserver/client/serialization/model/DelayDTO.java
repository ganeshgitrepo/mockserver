package org.mockserver.client.serialization.model;

import org.mockserver.model.Delay;
import org.mockserver.model.ModelObject;

import java.util.concurrent.TimeUnit;

/**
 * @author jamesdbloom
 */
public class DelayDTO extends ModelObject {

    private TimeUnit timeUnit = TimeUnit.SECONDS;
    private long value = 0;

    public DelayDTO(Delay delay) {
        timeUnit = delay.getTimeUnit();
        value = delay.getValue();
    }

    public DelayDTO() {
    }

    public Delay buildObject() {
        return new Delay(timeUnit, value);
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public DelayDTO setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    public long getValue() {
        return value;
    }

    public DelayDTO setValue(long value) {
        this.value = value;
        return this;
    }
}
