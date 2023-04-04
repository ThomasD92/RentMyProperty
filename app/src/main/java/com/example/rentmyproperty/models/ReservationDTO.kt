package com.example.rentmyproperty.models

import jakarta.validation.constraints.NotNull
import java.time.LocalDate

class ReservationDTO {

    var id: Long? = null

    @NotNull
    var fromDate: LocalDate? = null

    @NotNull
    var toDate: LocalDate? = null

    @NotNull
    var tenant: Long? = null

    @NotNull
    var `property`: Long? = null

}