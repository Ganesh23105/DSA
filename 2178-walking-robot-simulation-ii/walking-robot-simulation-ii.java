class Robot {
    int w, h;
    int perimeter;
    int currStep;
    boolean moved;

    public Robot(int width, int height) {
        this.w = width;
        this.h = height;
        this.perimeter = 2 * (w + h - 2);
        this.currStep = 0;
        this.moved = false;
    }

    public void step(int num) {
        currStep = (currStep + num) % perimeter;
        if (num > 0) moved = true;
    }

    public int[] getPos() {
        int step = currStep;

        // Bottom row (left → right)
        if (step < w) {
            return new int[]{step, 0};
        }
        step -= w;

        // Right column (bottom → top)
        if (step < h - 1) {
            return new int[]{w - 1, step + 1};
        }
        step -= (h - 1);

        // Top row (right → left)
        if (step < w - 1) {
            return new int[]{w - 2 - step, h - 1};
        }
        step -= (w - 1);

        // Left column (top → bottom)
        return new int[]{0, h - 2 - step};
    }

    public String getDir() {
        // 🔥 Important edge case
        if (currStep == 0 && moved) return "South";

        int step = currStep;

        if (step < w) return "East";
        step -= w;

        if (step < h - 1) return "North";
        step -= (h - 1);

        if (step < w - 1) return "West";

        return "South";
    }
}