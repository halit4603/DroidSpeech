package com.vikramezhil.droidspeech;

/**
 * Created by Vikram Ezhil on 29/07/17
 *
 * Droid Speech Listener
 */

public interface OnDSListener
{
    /**
     * The droid speech rms changed result
     *
     * @param rmsChangedValue The rms changed result
     */
    void onDroidSpeechRmsChanged(float rmsChangedValue);

    /**
     * The droid speech recognizer live result
     *
     * @param liveSpeechResult The live speech result
     */
    void onDroidSpeechLiveResult(String liveSpeechResult);

    /**
     * The droid speech recognizer final result
     *
     * @param finalSpeechResult The final speech result
     */
    void onDroidSpeechFinalResult(String finalSpeechResult);

    /**
     * The droid speech recognition was closed by user
     */
    void onDroidSpeechClosedByUser();

    /**
     * The droid speech recognizer error update
     *
     * @param errorMsg The error message
     */
    void onDroidSpeechError(String errorMsg);
}
