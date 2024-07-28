import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// Device interface
interface Device {
    void turnOn();
    void turnOff();
    String getStatus();
}

// Light device
class Light implements Device {
    private int id;
    private boolean isOn;

    public Light(int id) {
        this.id = id;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + (isOn ? "On" : "Off");
    }
}

// Thermostat device
class Thermostat implements Device {
    private int id;
    private int temperature;

    public Thermostat(int id) {
        this.id = id;
        this.temperature = 70;
    }

    @Override
    public void turnOn() {
        // Not applicable
    }

    @Override
    public void turnOff() {
        // Not applicable
    }

    @Override
    public String getStatus() {
        return "Thermostat is set to " + temperature + " degrees";
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}

// Door lock device
class DoorLock implements Device {
    private int id;
    private boolean isLocked;

    public DoorLock(int id) {
        this.id = id;
        this.isLocked = true;
    }

    @Override
    public void turnOn() {
        isLocked = false;
    }

    @Override
    public void turnOff() {
        isLocked = true;
    }

    @Override
    public String getStatus() {
        return "Door is " + (isLocked ? "Locked" : "Unlocked");
    }
}

// Device factory
class DeviceFactory {
    public static Device createDevice(int id, String type) {
        switch (type) {
            case "light":
                return new Light(id);
            case "thermostat":
                return new Thermostat(id);
            case "door":
                return new DoorLock(id);
            default:
                throw new UnsupportedOperationException("Unsupported device type");
        }
    }
}

// Smart home system
class SmartHomeSystem {
    private List<Device> devices;
    private List<ScheduledTask> scheduledTasks;
    private List<AutomatedTrigger> automatedTriggers;

    public SmartHomeSystem() {
        devices = new ArrayList<>();
        scheduledTasks = new ArrayList<>();
        automatedTriggers = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    public void turnOnDevice(int id) {
        Device device = getDevice(id);
        if (device != null) {
            device.turnOn();
        }
    }

    public void turnOffDevice(int id) {
        Device device = getDevice(id);
        if (device != null) {
            device.turnOff();
        }
    }

    public void scheduleTask(int id, String time, String command) {
        ScheduledTask task = new ScheduledTask(id, time, command);
        scheduledTasks.add(task);
    }

    public void addTrigger(String condition, String action) {
        AutomatedTrigger trigger = new AutomatedTrigger(condition, action);
        automatedTriggers.add(trigger);
    }

    public String getStatusReport() {
        StringBuilder report = new StringBuilder();
        for (Device device : devices) {
            report.append(device.getStatus()).append(". ");
        }
        return report.toString();
    }

    public List<ScheduledTask> getScheduledTasks() {
        return scheduledTasks;
    }

    public List<AutomatedTrigger> getAutomatedTriggers() {
        return automatedTriggers;
    }

    private Device getDevice(int id) {
        for (Device device : devices) {
            if (device instanceof Light && ((Light) device).id == id) {
                return device;
            } else if (device instanceof Thermostat && ((Thermostat) device).id == id) {
                return device;
            } else if (device instanceof DoorLock && ((DoorLock) device).id == id) {
                return device;
            }
        }
        return null;
    }
}

// Scheduled task
class ScheduledTask {
    private int id;
    private String time;
    private String command;

    public ScheduledTask(int id, String time, String command) {
        this.id = id;
        this.time = time;
        this.command = command;
    }

    public int getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public String getCommand() {
        return command;
   
