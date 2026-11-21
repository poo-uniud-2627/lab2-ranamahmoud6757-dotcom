// Pong — Programmazione Orientata agli Oggetti e Laboratori, Udine, a.a. 2026-27
package ostacoli;

import nebbia.Nebbia;

/**
 * Tutto quello che cambia da un livello all'altro.
 */
public record Livello(int numero, double velocitaPalla,
                      double erroreMassimo, Ostacoli ostacoli,
                      Nebbia nebbia) {
}