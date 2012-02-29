// GraphLab Project: http://graphlab.sharif.edu
// Copyright (C) 2008 Mathematical Science Department of Sharif University of Technology
// Distributed under the terms of the GNU Lesser General Public License (LGPL): http://www.gnu.org/licenses/

/**
 *
 */
package graphlab.library.event;


/**
 * this Event is a algorithm step, (is it a major step) -> play one step (on AnimatorGUI)
 *
 * @author Omid
 */
public class AlgorithmStep implements Event {

    public AlgorithmStep() {

    }

    public String getDescription() {
        return "Asks the handler to make a step. For animation purposes.";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;

    public boolean isStep() {
        return true;
    }

    public String getID() {
        return "Step Event";

    }
}
