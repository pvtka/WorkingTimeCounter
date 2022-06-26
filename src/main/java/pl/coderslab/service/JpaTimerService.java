package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Timer;
import pl.coderslab.repository.TimerRepository;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class JpaTimerService implements TimerService {
    private final TimerRepository timerRepository;

    public JpaTimerService(TimerRepository timerRepository) {
        this.timerRepository = timerRepository;
    }

    @Override
    public List<Timer> getTime() {
        return timerRepository.findAll();
    }


    @Override
    public void addTime(Timer time) {
        timerRepository.save(time);
    }

    @Override
    public Optional<Timer> get(Long id) {
        return timerRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        timerRepository.deleteById(id);
    }

    @Override
    public void update(Timer time) {
        timerRepository.save(time);
    }

}
