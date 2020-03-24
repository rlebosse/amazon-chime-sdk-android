/*
 * Copyright (c) 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 */

package com.amazonaws.services.chime.sdk.meetings.session

import com.amazonaws.services.chime.sdk.meetings.audiovideo.AudioVideoFacade
import com.amazonaws.services.chime.sdk.meetings.utils.logger.Logger

/**
 * [MeetingSession] contains everything needed for the attendee to authenticate,
 * reach the meeting service, start audio, and start video
 */
interface MeetingSession {
    val configuration: MeetingSessionConfiguration
    val logger: Logger
    val audioVideo: AudioVideoFacade
}