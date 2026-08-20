package com.ericjunq.exceptions;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String content) {
}
