/**
 * Session represents a logged-in user state.
 * * Why this class exists:
 * - Login is not permanent
 * - Session has a lifetime
 * * This introduces the idea of time-based state.
 */
class Session {
    private String username;
    private long loginTime;
    private long timeoutMillis;

    public Session(String username) {
        this.username = username;
        this.loginTime = System.currentTimeMillis();
        // Default session lifetime set to 5 minutes (300,000 milliseconds)
        this.timeoutMillis = 5 * 60 * 1000; 
    }

    /**
     * Checks whether the session is still valid.
     */
    public boolean isExpired() {
        return (System.currentTimeMillis() - loginTime) > timeoutMillis;
    }

    @Override
    public String toString() {
        return "Session active for user: " + username;
    }
}