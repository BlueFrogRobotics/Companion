# Companion
Service with companion component, an event detector/manager and a mission manager.

Event detector/manager will handle every event happening to the robot (caress, sensors triggers, etc..)
Mission manager will handle every mission that the robot has to do after an event. For example if the robot receive an email, event detector/manager will catch it and mission manager will put the mission "deliver the message to the user" at the top of the stack.
