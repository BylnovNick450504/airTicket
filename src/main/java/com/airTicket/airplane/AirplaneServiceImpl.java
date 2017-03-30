package com.airTicket.airplane;

import com.airTicket.core.ResponseStatus;
import com.airTicket.seat.Seat;
import com.airTicket.seat.SeatRepository;
import com.airTicket.seat.classification.SeatClass;
import com.airTicket.seat.classification.SeatClassRepository;
import com.airTicket.seat.info.SeatInfo;
import com.airTicket.seat.status.SeatStatus;
import com.airTicket.seat.status.SeatStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirplaneServiceImpl implements AirplaneService {

    private final AirplaneRepository airplaneRepository;
    private final SeatRepository seatRepository;
    private final SeatClassRepository seatClassRepository;
    private final SeatStatusRepository seatStatusRepository;

    @Autowired
    public AirplaneServiceImpl(AirplaneRepository airplaneRepository, SeatRepository seatRepository, SeatClassRepository seatClassRepository, SeatStatusRepository seatStatusRepository) {
        this.airplaneRepository = airplaneRepository;
        this.seatRepository = seatRepository;
        this.seatClassRepository = seatClassRepository;
        this.seatStatusRepository = seatStatusRepository;
    }

    @Override
    public ResponseStatus initAirplane(Long id, AirplaneInfo airInfo) {

        Airplane airplane;
        int number = 1;
        final long SEAT_STATUS_ID = 1;
        final String SEAT_STATUS = "FREE";
        List<Seat> seats = new ArrayList<>();

        airplane = airplaneRepository.findOne(id);
        if (airplane == null) {
            return new ResponseStatus();
        }

        SeatStatus seatStatus = seatStatusRepository.findOne(SEAT_STATUS_ID);
        if (seatStatus == null || !seatStatus.getSeatStatus().equals(SEAT_STATUS)) {
            return new ResponseStatus();
        }

        for(SeatInfo seatInfo: airInfo.getAirInfo()) {
            SeatClass seatClassTemp = seatClassRepository.findOne(seatInfo.getSeatClassId());
            if(seatClassTemp == null) {
                seatRepository.delete(seats);
                return new ResponseStatus();
            }

            for(int i = 0; i < seatInfo.getCount(); i++) {
                Seat seat = new Seat(seatClassTemp, number++, seatStatus);
                seat.setAirplane(airplane);
                seatRepository.save(seat);
                seats.add(seat);
            }
        }
        return new ResponseStatus(true);
    }
}
