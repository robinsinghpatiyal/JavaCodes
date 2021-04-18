public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public void setTime(int hr, int min) {
        hours.setValue(hr);
        minutes.setValue(min);
        updateDisplay();
    }


    public String getTime() {

        return displayString;

    }
    public void timeTick() {
        minutes.increment();
        if(minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    private void updateDisplay() {
        int hour = hours.getValue();
        String suffix;

        if (hour >= 12) {
            suffix = " pm";
            if (hour > 12) hours.setValue(hour-12);
        } else {
            suffix = " am";
        }

        displayString = hours.getDisplayValue() + ":" +
                minutes.getDisplayValue() + suffix;
    }

}

