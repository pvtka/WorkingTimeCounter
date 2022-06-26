package pl.coderslab.service;

import pl.coderslab.model.Timer;

import java.util.List;
import java.util.Optional;

public interface TimerService {
    List<Timer> getTime();
    void addTime(Timer time);
    Optional<Timer> get(Long id);
    void delete(Long id);
    void update(Timer time);
}
